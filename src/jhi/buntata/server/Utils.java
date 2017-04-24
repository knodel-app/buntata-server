/*
 * Copyright 2016 Information & Computational Sciences, The James Hutton Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jhi.buntata.server;

import java.io.*;

/**
 * A bunch of utility methods.
 *
 * @author Sebastian Raubach
 */
public class Utils
{
	/**
	 * Deletes a directory recursively. All files and directories under this directory will be deleted.
	 *
	 * @param dir The directory to delete
	 */
	public static void deleteDirectory(File dir)
	{
		if (dir != null && dir.isDirectory() && dir.exists())
		{
			File[] files = dir.listFiles();

			if (files != null)
			{
				for (File file : files)
				{
					if (file.isFile() && file.exists())
						file.delete();
					else if (file.isDirectory() && file.exists())
						deleteDirectory(file);
				}
			}

			dir.delete();
		}
	}
}
