package android.coolweather.com.coolwerther.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/11/27.
 */

public class Province extends DataSupport{
    private  int id;
    private String provincenName;
    private  int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincenName() {
        return provincenName;
    }

    public void setProvincenName(String provincenName) {
        this.provincenName = provincenName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
