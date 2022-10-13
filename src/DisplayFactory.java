public class DisplayFactory {

    public Display create(DisplayType displayType) {
        if(displayType == DisplayType.CSV){
            return new DisplayToCSV();
        }
        if(displayType == DisplayType.CONSOLE){
            return new DisplayOnConsole();
        }
        throw new InvalidDisplaySpecifiedException("ERROR - Factory method does not contain display type specified.");
    }
}