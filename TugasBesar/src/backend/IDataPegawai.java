package backend;

import java.util.ArrayList;

public interface IDataPegawai {
    public Object getById(int id);
    public ArrayList getAll();
    public void save();
    public void delete();
}
