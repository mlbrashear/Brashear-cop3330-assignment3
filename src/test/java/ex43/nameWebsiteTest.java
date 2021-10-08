package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameWebsiteTest {

    @Test
    void website() {
        assertEquals("./website/awesomeco", nameWebsite.website("awesomeco"));
    }

    @Test
    void websiteIndexhtml() {
        assertEquals("./website/awesomeco/index.html", nameWebsite.websiteIndexhtml("awesomeco"));
    }

    @Test
    void websitejs() {
        assertEquals("./website/awesomeco/js/", nameWebsite.websitejs("awesomeco"));
    }

    @Test
    void websitecss() {
        assertEquals("./website/awesomeco/css/", nameWebsite.websitecss("awesomeco"));
    }
}