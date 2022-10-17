package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

}
