package test;

import main.DisplayFactory;
import main.display_object.DisplayOnConsole;
import main.display_object.DisplayToCSV;
import main.DisplayType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    }


