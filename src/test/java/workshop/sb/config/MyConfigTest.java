package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")
public class MyConfigTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Environment environment;

    @Test
    public void shouldReturnFoo() throws Exception {
        this.mockMvc.perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string(environment.getProperty("test.property.foo")));
    }

    @Test
    public void shouldReturnBar() throws Exception {
        this.mockMvc.perform(get("/bar"))
                .andExpect(status().isOk())
                .andExpect(content().string(environment.getProperty("test.property.bar")));
    }

    @Test
    public void shouldReturnX() throws Exception {
        this.mockMvc.perform(get("/x"))
                .andExpect(status().isOk())
                .andExpect(content().string(environment.getProperty("test.property.x")));
    }
}
