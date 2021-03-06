package com.Testecomdados.Unit.contato;
import java.util.List;
import javax.validation.ConstraintViolationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import com.Testecomdados.Unit.model.ContatoModel;
import com.Testecomdados.Unit.repository.ContatoRepository;


public class ContatosRepositoryIntegrationTest {

	private ContatoModel contato;
	@Autowired
	private ContatoRepository contatoRepository;
	@Before
	public void start() {
	contato = new ContatoModel("Tatiane", "Tatiia", "9909201909");
	}
	//regra, não aceita exceções, é a maneira de especificar
	//que a execução de um teste lançará uma exceção
	//Verifica se o @NotEmpty está funcionando
	@Rule
	public ExpectedException esperadaExcecao = ExpectedException.none();
	@Test
	public void salvarComTelNulo() throws Exception {
	esperadaExcecao.expect(ConstraintViolationException.class);
	esperadaExcecao.expectMessage("O Telefone deve ser preenchido");
	contato.setTelefone(null);
	contatoRepository.save(contato);
	}
	@Test
	public void salvarComDddNulo() throws Exception {
	esperadaExcecao.expect(ConstraintViolationException.class);
	esperadaExcecao.expectMessage("O DDD deve ser preenchido");
	contato.setDdd(null);
	contatoRepository.save(contato);

	

	}
	@Test
	public void salvarComNomeNulo() throws Exception {
	esperadaExcecao.expect(ConstraintViolationException.class);
	esperadaExcecao.expectMessage("O Nome deve ser preenchido");
	contato.setNome(null);
	contatoRepository.save(contato);
	}
	}

