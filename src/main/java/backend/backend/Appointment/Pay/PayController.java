package backend.backend.Appointment.Pay;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pay/")
@CrossOrigin({"*"})
public class PayController {
    @Autowired 
    private PayService payService;

    @PostMapping("/")
    public Pay save(@RequestBody Pay entity)
    {
        return payService.save(entity);
    }

    @GetMapping("/{id_pay}/")
    public Pay findPay(@PathVariable long id_pay)
    {
        return payService.findById(id_pay);
    }
    
    @PutMapping("/{id_pay}/")
    public Pay update(@RequestBody Pay entity)
    {
        return payService.save(entity);
    }

    @DeleteMapping("/{id_pay}/")
    public void deleteByID(@PathVariable long id_pay)
    {
        payService.deleteByID(id_pay);
    }

    @GetMapping("/")
    public List<Pay> findAll()
    {
        return payService.findAll();
    }
}
