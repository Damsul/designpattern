package builder.coffee;

public class VanillaLatteBuilder extends CoffeeBuilder {


    @Override
    public void buildLiquid() {
        coffee.setLiquid("Milk");
    }

    @Override
    public void buildBeans() {
        coffee.setBeans("Kenya Beans");
    }

    @Override
    public void buildSyrup() {
        coffee.setSyrup("Vanilla Syrup");
    }
}
