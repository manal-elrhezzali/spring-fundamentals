import com.manal.repository.HibernateSpeakerRepositoryImpl;
import com.manal.repository.SpeakerRepository;
import com.manal.service.SpeakerService;
import com.manal.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//  @Bean(name = "speakerService")
//  public SpeakerService getSpeakerService() {
//    return new SpeakerServiceImpl();
//  }
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
}
