package fi.haagahelia.tyotunnit.kontrolleri;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import fi.haagahelia.tyotunnit.bean.Henkilo;





@Controller
@SessionAttributes({ "kirjautunut" })
@RequestMapping("/kontrolleri")
public class TunnitKontrolleri {

	// FORMIN TEKEMINEN
	@RequestMapping(value = "/kirjaudu", method = RequestMethod.GET)
	public String getCreateForm(Model model) {
		Henkilo tyhjaHenkilo = new Henkilo();
		tyhjaHenkilo.setKayttajatunnus("");
		model.addAttribute("henkilo", tyhjaHenkilo);
		return "kirjaudu";
	}

	// FORMIN TIETOJEN VASTAANOTTO
	@RequestMapping(value = "kirjaudu", method = RequestMethod.POST)
	public String create(@ModelAttribute(value = "henkilo") Henkilo henkilo, Model model) {
		String kayttajatunnus = henkilo.getKayttajatunnus();
		String salasana = henkilo.getSalasana();
		if(kayttajatunnus.equals("1") && salasana.equals("123")) {
			model.addAttribute("kirjautunut", "on");
			return "lisaatunnit";
		} else {
			return "kirjaudu";
		}
	}
	
	
}
