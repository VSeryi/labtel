package es.urjc.etsii.labtel.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of ProjectPermissionSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class ProjectPermissionSearchRepositoryMockConfiguration {

    @MockBean
    private ProjectPermissionSearchRepository mockProjectPermissionSearchRepository;

}
