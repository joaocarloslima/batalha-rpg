package br.senac.sp.batalha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BatalhaController {

    // declarar um atributo jogador
    // declarar um atributo inimigo
    
    @GetMapping
    public String index() {
        // apagar a instancia do jogador
        // apagar a instancia do inimigo
        return "index";
    }

    @PostMapping("jogador")
    public String criarJogador(String nome, int vida, int ataque, int defesa, Model model) {
        // instanciar o jogador com os parâmetros do método
        return "redirect:batalha";
    }

    @GetMapping("batalha")
    public String batalha(Model model) {
        // se jogador for nulo, redireciona para /
        // se inimigo for nulo, cria utilizar método de jogador aleatório

        // model.addAttribute("jogador", jogador);
        // model.addAttribute("inimigo", inimigo);

        return "batalha";
    }

    @PostMapping("turno")
    public String turno( Model model) {
        // model.addAttribute("jogador", jogador);
        return "batalha";
    }

    @PostMapping("batalha")
    public String batalha(RedirectAttributes redirect){
        String msg = "";
        // jogador ataca o inimigo
        // inimigo ataca o jogador
        // variável msg recebe o returno dos dois métodos
        redirect.addFlashAttribute("msg", msg);
        return "redirect:batalha";
    }

    // private Jogador randomJogador() {
    //     String[] nomes = {"Abysscaller", "Soulbinder", "Voxanomaly", "Galefiend", "Gigglegore"}; 
    //     int vida = (int) (Math.random() * 50) + 1;
    //     int ataque = (int) (Math.random() * 20) + 1;
    //     int defesa = (int) (Math.random() * 10) + 1;
    //     int i = (int) (Math.random() * nomes.length);
    //     return new Jogador(nomes[i], vida, ataque, defesa);
    // }
}
