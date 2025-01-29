package br.senac.sp.batalha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BatalhaController {
    
    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("jogador")
    public String criarJogador(String nome, int vida, int ataque, int defesa, Model model) {
        return "redirect:batalha";
    }

    @GetMapping("batalha")
    public String batalha(Model model) {
        return "batalha";
    }

    @PostMapping("turno")
    public String turno( Model model) {
        return "batalha";
    }

    @PostMapping("batalha")
    public String batalha(RedirectAttributes redirect){
        String msg = "";
        redirect.addFlashAttribute("msg", msg);
        return "redirect:batalha";
    }

    // private Jogador randomJogador() {
    //     String[] nomes = {"Abysscaller", "Soulbinder", "Voxanomaly", "Galefiend", "Gigglegore"}; 
    //     int vida = (int) (Math.random() * 50) + 1;
    //     int ataque = (int) (Math.random() * 10) + 1;
    //     int defesa = (int) (Math.random() * 5) + 1;
    //     int i = (int) (Math.random() * nomes.length);
    //     return new Jogador(nomes[i], vida, ataque, defesa);
    // }
}
