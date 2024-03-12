package com.findall.findallapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FindallappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindallappApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Findall teste";
	}

	@GetMapping("/cadastro")
	public String cadastro() {
		return "{\"nomeCompleto\": \"João da Silva\", \"cnpj\": \"12345678901234\", \"telefone\": \"(11) 99999-9999\", \"descricaoServico\": \"Serviço de limpeza\", \"categorias\": \"Limpeza\", \"custoMedioPorHora\": \"50\", \"diaSemana\": \"Segunda-feira\", \"horarioInicial\": \"08:00\", \"horarioFinal\": \"18:00\"}";
	}

	@GetMapping("/servicos")
	public String buscarServicos() {
		return "[{\"nome\": \"Limpeza de casa\", \"valor\": \"100\", \"prazo\": \"1 dia\", \"descricao\": \"Limpeza completa da casa\", \"galeriaFotos\": \"[foto1.jpg, foto2.jpg]\", \"diaSemana\": \"Segunda-feira\", \"horario\": \"08:00-18:00\"}, {\"nome\": \"Manutenção de jardim\", \"valor\": \"80\", \"prazo\": \"2 dias\", \"descricao\": \"Corte de grama e poda de arbustos\", \"galeriaFotos\": \"[foto3.jpg, foto4.jpg]\", \"diaSemana\": \"Terça-feira\", \"horario\": \"09:00-17:00\"}]";
	}

	@GetMapping("/perfil-prestador")
	public String perfilPrestador() {
		return "{\"capaPrestador\": \"capa.jpg\", \"fotoPrestador\": \"foto.jpg\", \"nomePrestador\": \"João da Silva\", \"descricaoPrestador\": \"Prestador de serviços de limpeza com mais de 5 anos de experiência\"}";
	}

	@GetMapping("/lista-servicos-prestador")
	public String listaServicosPrestador() {
		return "[{\"capaServico\": \"servico1.jpg\", \"nomeServico\": \"Limpeza de casa\", \"descricaoServico\": \"Limpeza completa da casa\", \"valorServico\": \"100\"}, {\"capaServico\": \"servico2.jpg\", \"nomeServico\": \"Manutenção de jardim\", \"descricaoServico\": \"Corte de grama e poda de arbustos\", \"valorServico\": \"80\"}]";
	}
}
