package pluginroot.elementof;

import java.io.IOException;
import java.io.Reader;

import com.google.common.io.CharSource;

public class AcceptOnlyAs extends Acceptor {

	@Override
	public boolean accept(CharSource source) {
		if (source == null)
			return false;

		try {
			Reader x = source.openStream();
			int i;
			while ((i = x.read()) != -1)
				if (!(i == 'A' || i == 'a'))
					return false;
			return true;
		} catch (IOException e) {
			return false;
		}
	}

}
