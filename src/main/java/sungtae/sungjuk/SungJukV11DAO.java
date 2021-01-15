package sungtae.sungjuk;

import java.util.ArrayList;

public interface SungJukV11DAO {
    String insertSungJuk(SungJukVO sj);
    ArrayList<SungJukVO> selectSungJuk();
    SungJukVO selectOneSungJuk(String sjno);
    String updateSungJuk(SungJukVO sj);
    String deleteSungJuk(int sjno);
}
