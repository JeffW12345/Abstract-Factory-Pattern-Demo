import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class GlueFactoryTests {
    GlueFactory glueFactory = new GlueFactory();

    @Test
    public void glueFactory_Should_Return_SuperGlue_When_Asked(){
        assertThat(glueFactory.create(GlueType.SUPERGLUE, "test", 0, new DisplayOnConsole())).isExactlyInstanceOf(SuperGlue.class);
    }

    @Test
    public void glueFactory_Should_Return_Pritstick_When_Asked(){
        assertThat(glueFactory.create(GlueType.PRITSTICK,"test", 0, new DisplayOnConsole())).isExactlyInstanceOf(Pritstick.class);
    }

    @Test
    public void glueFactory_Should_Return_WoodGlue_When_Asked(){
        assertThat(glueFactory.create(GlueType.WOODGLUE,"test", 0, new DisplayOnConsole())).isExactlyInstanceOf(WoodGlue.class);
    }

    @Test
    public void glueFactory_Should_Throw_Exception_If_Asked_To_Retrieve_Magic_Glue(){
        assertThrows(InvalidGlueSpecifiedException.class, () -> glueFactory.create(GlueType.MAGICGLUE, "test", 0, new DisplayOnConsole()));
    }

}
