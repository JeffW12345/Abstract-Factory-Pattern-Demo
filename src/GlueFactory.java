public class GlueFactory {

    public Glue create(GlueType glueType, String name, double price, Display display){
        if(glueType == GlueType.SUPERGLUE){
            return new SuperGlue(name, price, display);
        }
        if(glueType == GlueType.PRITSTICK){
            return new Pritstick(name, price, display);
        }
        if(glueType == GlueType.WOODGLUE){
            return new WoodGlue(name, price, display);
        }
       throw new InvalidGlueSpecifiedException("ERROR - Factory method does not contain glue type specified.");
    }
}
