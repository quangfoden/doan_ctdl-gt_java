package Dslkkep;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class DLinkDao {
	public void ghiFile(DoubleLink first) {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		try {

			fout = new FileOutputStream("d:\\thi3.bin");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(first);

			System.out.println("Xong rồi!");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
public DoubleLink docFile(String filename) {

		DoubleLink first = new DoubleLink();

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {
			fin = new FileInputStream(filename);
			ois = new ObjectInputStream(fin);
			first = (DoubleLink) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return first;
	}

	
	
}
