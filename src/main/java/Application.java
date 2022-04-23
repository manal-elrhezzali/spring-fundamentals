import com.manal.service.SpeakerService;
import com.manal.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    //loads Spring and the configuration files we have into our ApplicationContext
    //when it's run, it'll create a basic registry with 2 beans in it: the "speakerService" bean
    // and the "speakerRepository" bean
    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

    //SpeakerService service = new SpeakerServiceImpl();
    SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

//    System.out.println(service);

    System.out.println(service.findAll().get(0).getFirstName());
    System.out.println(service.findAll().get(0).getSeedNum());

//    SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

//    System.out.println(service2);

  }
}
