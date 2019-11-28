package com.jp.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jp.cursomc.domain.Categoria;
import com.jp.cursomc.domain.Cidade;
import com.jp.cursomc.domain.Cliente;
import com.jp.cursomc.domain.Endereco;
import com.jp.cursomc.domain.Estado;
import com.jp.cursomc.domain.ItemPedido;
import com.jp.cursomc.domain.Pagamento;
import com.jp.cursomc.domain.PagamentoComBoleto;
import com.jp.cursomc.domain.PagamentoComCartao;
import com.jp.cursomc.domain.Pedido;
import com.jp.cursomc.domain.Produto;
import com.jp.cursomc.domain.enums.EstadoPagamento;
import com.jp.cursomc.domain.enums.TipoCliente;
import com.jp.cursomc.repositories.CategoriaRepository;
import com.jp.cursomc.repositories.CidadeRepository;
import com.jp.cursomc.repositories.ClienteRepository;
import com.jp.cursomc.repositories.EnderecoRepository;
import com.jp.cursomc.repositories.EstadoRepository;
import com.jp.cursomc.repositories.ItemPedidoRepository;
import com.jp.cursomc.repositories.PagamentoRepository;
import com.jp.cursomc.repositories.PedidoRepository;
import com.jp.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
