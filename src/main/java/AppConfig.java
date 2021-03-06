import com.manal.repository.HibernateSpeakerRepositoryImpl;
import com.manal.repository.SpeakerRepository;
import com.manal.service.SpeakerService;
import com.manal.service.SpeakerServiceImpl;
import com.manal.util.CalendarFactory;
import java.util.Calendar;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.manal"})//tells Spring that this is where we want it to start
// scanning for beans to autowire
public class AppConfig {

  @Bean(name = "cal")
  public CalendarFactory calFactory() {
    CalendarFactory factory= new CalendarFactory();
    factory.addDays(2);
    return factory;
  }

  @Bean
  public Calendar cal() throws Exception {
    return calFactory().getObject();
  }
//  @Bean(name = "speakerService")
//  public SpeakerService getSpeakerService() {
//    return new SpeakerServiceImpl();
//  }
  /*
  @Bean(name = "speakerService")
  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
  public SpeakerService getSpeakerService() {
    //constructor injection
//    SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
    SpeakerServiceImpl service = new SpeakerServiceImpl();
    //setter injection
  //service.setRepository(getSpeakerRepository());
    return service;
  }

  @Bean(name = "speakerRepository")
  public SpeakerRepository getSpeakerRepository() {
    return new HibernateSpeakerRepositoryImpl();
  }
  */
}
