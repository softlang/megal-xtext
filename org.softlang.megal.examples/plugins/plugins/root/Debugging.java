package plugins.root;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.function.Consumer;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.softlang.megal.api.Evaluator;
import org.softlang.megal.mi2.Relationship;

import com.google.common.io.ByteSource;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharSink;
import com.google.common.io.OutputSupplier;

import static com.google.common.base.Objects.*;

public class Debugging {
	public static CharSink openConsole(Evaluator evaluator) {
		return openConsole(evaluator.getClass().getName(), null);
	}

	public static CharSink openConsole(String consoleName,
			ImageDescriptor imageDescriptor) {
		// Find the console
		MessageConsole messageConsole = findConsole(consoleName,
				imageDescriptor);

		return new CharSink() {
			@Override
			public Writer openStream() throws IOException {
				// Get a new console stream on the given console
				MessageConsoleStream consoleStream = new MessageConsoleStream(
						messageConsole);

				return new Writer() {
					@Override
					public void write(char[] cbuf, int off, int len)
							throws IOException {
						CharsetEncoder encoder = obtainEncoder(consoleStream);
						ByteBuffer buffer = encoder.encode(CharBuffer.wrap(
								cbuf, off, len));

						consoleStream.
					}

					@Override
					public void flush() throws IOException {
						consoleStream.flush();
					}

					@Override
					public void close() throws IOException {
						consoleStream.close();
					}

					private CharsetEncoder obtainEncoder(
							MessageConsoleStream consoleStream) {
						String encoding = consoleStream.getConsole()
								.getEncoding();

						if (encoding == null)
							return Charset.defaultCharset().newEncoder();
						else
							return Charset.forName(encoding).newEncoder();
					}

				};
			}
		};
	}

	private static MessageConsole findConsole(String consoleName,
			ImageDescriptor imageDescriptor) {
		// Get manager
		IConsoleManager cm = ConsolePlugin.getDefault().getConsoleManager();

		// Find a console
		MessageConsole messageConsole = null;

		for (IConsole console : cm.getConsoles())
			if (console instanceof MessageConsole)
				if (equal(consoleName, console.getName())) {
					messageConsole = (MessageConsole) console;
					break;
				}

		// Or create it
		if (messageConsole == null)
			messageConsole = new MessageConsole(consoleName, imageDescriptor);

		// Add and show it
		cm.addConsoles(new IConsole[] { messageConsole });
		cm.showConsoleView(messageConsole);
		return messageConsole;
	}
}