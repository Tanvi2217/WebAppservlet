package p1;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DaoInterface {
	public ArrayList<String> validate();
	public String courseselect() throws SQLException;
}
