package com.sid.younes.inventoryservice;

import com.sid.younes.inventoryservice.entities.Product;
import com.sid.younes.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration)
	{
		return args -> {
			restConfiguration.exposeIdsFor(Product.class);

			productRepository.saveAll(
					List.of(
							Product.builder().name("PC").quantity(50).price(9000).build(),
							Product.builder().name("PHONE").quantity(10).price(5000).build(),
							Product.builder().name("CAMERA").quantity(30).price(22000).build()


					)
			);

		};
	}

}
