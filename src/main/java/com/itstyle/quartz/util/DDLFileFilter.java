package com.itstyle.quartz.util;

import java.io.File;
import java.io.FileFilter;

/**类说明:
 * @author dhm
 * 2020年3月12日
 */
public class DDLFileFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		if(file != null && file.exists() && file.isFile() && file.getName().toLowerCase().endsWith(".sql")) {
			return true;
		}
		return false;
	}

}
