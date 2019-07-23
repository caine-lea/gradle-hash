package org.gradle.wrapper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author caine
 */
public class PathAssemblerTest {
    PathAssembler pathAssembler;

    @Before
    public void setPathAssembler() {
        this.pathAssembler = new PathAssembler();
    }

    @Test
    public void hash55bin(){
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-5.5-bin.zip");
        Assert.assertEquals("6vk9q53mqlx7v10usp64xqfpd", hash);
    }

    @Test
    public void hash441bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-4.4.1-bin.zip");
        Assert.assertEquals("46gopw3g8i1v3zqqx4q949t2x", hash);
    }

    @Test
    public void hash44bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-4.4-bin.zip");
        Assert.assertEquals("bgaq7vklkazwgxox0hdadxbvi", hash);
    }

    @Test
    public void hash43bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-4.3-bin.zip");
        Assert.assertEquals("452wx51oxqsia28686mgqhot6", hash);
    }

    @Test
    public void hash40bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-4.0-bin.zip");
        Assert.assertEquals("3p92xsbhik5vmig8i90n16yxc", hash);
    }

    @Test
    public void hash35bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-3.5-bin.zip");
        Assert.assertEquals("daoimhu7k5rlo48ntmxw2ok3e", hash);
    }

    @Test
    public void hash321All() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-3.2.1-all.zip");
        Assert.assertEquals("97ld1dyml0oep92x4lyn4g235", hash);
    }

    @Test
    public void hashV32All() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-3.2-all.zip");
        Assert.assertEquals("97ld1dyml0oep92x4lyn4g235", hash);
    }

    @Test
    public void hashV33Bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-3.3-bin.zip");
        Assert.assertEquals("64bhckfm0iuu9gap9hg3r7ev2", hash);
    }

    @Test
    public void hashV32Bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-3.2-bin.zip");
        Assert.assertEquals("avantb235jk77byagvnd7aog7", hash);
    }

    @Test
    public void hashV34Bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-3.4.1-bin.zip");
        Assert.assertEquals("71zneekfcxxu7l9p7nr2sc65s", hash);
    }

    @Test
    public void hashV2141Bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-2.14.1-bin.zip");
        Assert.assertEquals("2r579t5wehc7ew5kc8vfqezww", hash);
    }

    @Test
    public void hashV210All() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-2.10-all.zip");
        Assert.assertEquals("a4w5fzrkeut1ox71xslb49gst", hash);
    }

    @Test
    public void hashV24Bin() {
        String hash = pathAssembler.getHash("https://services.gradle.org/distributions/gradle-2.4-bin.zip");
        Assert.assertEquals("1lebsnfoptv8qpa10w6kyy5mp", hash);
    }
}
