package vn.iotstar.configuration;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomSiteMeshFileter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/admin/*", "/decorators/admin.jsp")
				.addDecoratorPath("/student/*", "/decorators/student.jsp").addExcludedPath("/login*")
				.addExcludedPath("/login/*");
	}
}
