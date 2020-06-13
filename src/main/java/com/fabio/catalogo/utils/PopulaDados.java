package com.fabio.catalogo.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;

import com.fabio.catalogo.repository.CatalogoRepository;
import com.fabio.catalogo.model.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PopulaDados {
    
    @Autowired 
    CatalogoRepository catalogoRepository;

   // @PostConstruct
    public void cadastrarMusica(){

        List<Musica> listaMusica = new ArrayList<>();
        Musica musica1 = new Musica();
        Musica musica2 = new Musica();

        musica1.setAutor("Renato Russo"); 
        musica1.setData(LocalDate.now());
        musica1.setTitulo("Serenissima");
        musica1.setLetra("Sou um animal sentimental Me apego facil mente a quem desperta meu desejo Tente me obrigar a fazer o que eu não quero E cê vai logo ver o que acontece Acho que entendo você quis me dizer Mas existem outras coisas Consegui meu equilí­brio cortejando a insanidade Tudo está perdido mas existem possibilidades Tí­nhamos a ideia, você mudou os planos Tí­nhamos um plano, você mudou de ideia Já passou, já passou - quem sabe outro dia Antes eu sonhava, agora já não durmo Quando foi que competimos pela primeira vez O que ninguém percebe é o que todo mundo sabe Não entendo terrorismo, falávamos de amizade Não estou mais interessado no que sinto.");
    
        musica2.setAutor("Robert Plant"); 
        musica2.setData(LocalDate.now());
        musica2.setTitulo("All My Love");
        musica2.setLetra("Sou um animal sentimental Me apego facil mente a quem desperta meu desejo Tente me obrigar a fazer o que eu não quero E cê vai logo ver o que acontece Acho que entendo você quis me dizer Mas existem outras coisas Consegui meu equilí­brio cortejando a insanidade Tudo está perdido mas existem possibilidades Tí­nhamos a ideia, você mudou os planos Tí­nhamos um plano, você mudou de ideia Já passou, já passou - quem sabe outro dia Antes eu sonhava, agora já não durmo Quando foi que competimos pela primeira vez O que ninguém percebe é o que todo mundo sabe Não entendo terrorismo, falávamos de amizade Não estou mais interessado no que sinto.");

        listaMusica.add(musica1);
        listaMusica.add(musica2);

        for (Musica musica : listaMusica) {
            Musica salvarMusica = catalogoRepository.save(musica);
            System.out.println(salvarMusica.getId());
        }

    }


}