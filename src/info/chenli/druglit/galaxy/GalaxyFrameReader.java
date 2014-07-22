package info.chenli.druglit.galaxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Read <a href=
 * "http://communicator.sourceforge.net/sites/MITRE/distributions/GalaxyCommunicator/docs/manual/index.html"
 * >Galaxy</a> into internal data structure.
 * 
 * @author Chen Li
 *
 */
public class GalaxyFrameReader {

	private final static Logger logger = Logger
			.getLogger(GalaxyFrameReader.class.getName());

	void process(File file) {

		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(
					file));
			OutputStream output = null;

			int lastNonSpaceCh = -10000;
			int ch;
			while ((ch = isr.read()) != -1) {

				Character c = (char) ch;

				// output.write(ch);
				switch (c) {
				case '{':
					if (lastNonSpaceCh == -10000 || lastNonSpaceCh == '}'
							|| lastNonSpaceCh == '(') {
						Frame frame = new Frame();
						
					}
					break;
				case '>':
					break;
				default:
					if (tagOpen) {
						sb.append(c);
						continue;
					}

					output.write(c);
				}

			}

		} catch (IOException e) {
			logger.log(Level.SEVERE, e.toString(), e);
		} finally {

			try {
				input.close();
				output.close();
			} catch (IOException e) {
				logger.log(Level.SEVERE, e.toString(), e);
			}
		}

	}

}
