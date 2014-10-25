package org.softlang.megal.language.ui.swt

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB

class SWTUtil {
	def static parseStyleFragment(String s) {
		switch s.toLowerCase {
			case 'normal':
				SWT.NORMAL
			case 'italic':
				SWT.ITALIC
			case 'bold':
				SWT.BOLD
			default:
				SWT.NORMAL
		}
	}

	val static STYLE_SEPARATOR = ','

	def static parseStyle(String s) {
		s.split(STYLE_SEPARATOR).map[parseStyleFragment].fold(SWT.NORMAL, [a, b|a.bitwiseOr(b)])
	}

	def static parseColorFragment(String s) {
		Integer.valueOf(s)
	}

	val static COLOR_SEPARATOR = ','

	def static parseColor(String s) {
		val c = s.split(COLOR_SEPARATOR).map[parseColorFragment]

		new RGB(c.get(0), c.get(1), c.get(2))
	}
}
