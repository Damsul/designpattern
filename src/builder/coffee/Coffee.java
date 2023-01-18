package builder.coffee;

public class Coffee {

    private String liquid = "";
    private String beans = "";
    private String syrup = "";

    public void setLiquid(String liquid) {
        this.liquid = liquid;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public String getLiquid() {
        return liquid;
    }

    public String getBeans() {
        return beans;
    }

    public String getSyrup() {
        return syrup;
    }
}
