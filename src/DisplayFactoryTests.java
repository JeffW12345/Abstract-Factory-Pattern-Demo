import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

    public class DisplayFactoryTests {
        DisplayFactory displayFactory = new DisplayFactory();

        @Test
        public void factory_Should_Return_CSV_Display_Object_When_Asked(){
            assertThat(displayFactory.create(DisplayType.CSV)).isExactlyInstanceOf(DisplayToCSV.class);
        }

        @Test
        public void factory_Should_Return_Console_Display_Object_When_Asked(){
            assertThat(displayFactory.create(DisplayType.CONSOLE)).isExactlyInstanceOf(DisplayOnConsole.class);
        }

        @Test
        public void glueFactory_Should_Throw_Exception_If_Asked_To_Retrieve_Magic_Glue(){
            assertThrows(InvalidDisplaySpecifiedException.class, () -> displayFactory.create(DisplayType.NOTYETDEFINED));
        }

    }


