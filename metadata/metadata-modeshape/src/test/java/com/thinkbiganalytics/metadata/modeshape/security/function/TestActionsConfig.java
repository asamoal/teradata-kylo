/**
 * 
 */
package com.thinkbiganalytics.metadata.modeshape.security.function;

import javax.inject.Named;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thinkbiganalytics.metadata.modeshape.security.action.JcrAllowedActions;
import com.thinkbiganalytics.security.action.config.ActionGroupsBuilder;

/**
 *
 * @author Sean Felten
 */
@Configuration
public class TestActionsConfig {

    @Bean(name = "servicesPrototypeAllowedActions")
    public JcrAllowedActions allowedServiceActions(@Named("prototypesActionGroupsBuilder") ActionGroupsBuilder builder) {
        return (JcrAllowedActions) builder
                        .group("services")
                            .action("manageAuthorization")
                                .title("Manage Authorization")
                                .description("Allows modification of authorization access control lists")
                                .add()
                            .action("manageOperations")
                                .title("Manage Operations")
                                .description("Allows access to operations")
                                .subAction("adminOperations")
                                    .title("Administer Operations")
                                    .add()
                                .add()
                            .action("accessFeeds")
                                .title("Access Feeds")
                                .description("Allows access of feeds and feed related functions")
                                .subAction("categoryAccess")
                                    .subAction("createCategories")
                                        .title("Create Categories")
                                        .add()
                                    .subAction("adminCategories")
                                        .title("Administer Categories")
                                        .add()
                                    .add()
                                .subAction("accessFeeds")
                                    .subAction("createFeeds")
                                        .title("Create Feeds")
                                        .add()
                                    .subAction("adminFeeds")
                                        .title("Administer Feeds")
                                        .add()
                                    .subAction("importFeeds")
                                        .title("Import Feeds")
                                        .add()
                                    .subAction("exportFeeds")
                                        .title("Export Feeds")
                                        .add()
                                    .add()
                                .subAction("accessTemplates")
                                    .subAction("createTemplates")
                                        .title("Create Templates")
                                        .add()
                                    .subAction("adminTemplates")
                                        .title("Administer Templates")
                                        .add()
                                    .add()
                                .add()
                            .add()
                        .build();
    }
}
