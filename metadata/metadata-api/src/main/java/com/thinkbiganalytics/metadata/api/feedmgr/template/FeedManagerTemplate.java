package com.thinkbiganalytics.metadata.api.feedmgr.template;

import com.thinkbiganalytics.metadata.api.feedmgr.feed.FeedManagerFeed;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sr186054 on 5/4/16.
 */
public interface FeedManagerTemplate {

    interface ID extends Serializable { }

    List<FeedManagerFeed> getFeeds();

    boolean addFeed(FeedManagerFeed<?> feed);

    boolean removeFeed(FeedManagerFeed<?> feed);

    enum State {
        ENABLED, DISABLED
    }

    ID getId();

    String getName();

    String getNifiTemplateId();

    String getDescription();

    boolean isDefineTable();

    boolean isDataTransformation();

    boolean isAllowPreconditions();

    String getIcon();

    String getIconColor();

    String getJson();

    DateTime getCreatedTime();

    DateTime getModifiedTime();


    void setNifiTemplateId(String nifiTemplateId);

    void setAllowPreconditions(boolean allowedPreconditions);

    void setDefineTable(boolean defineTable);

    void setDataTransformation(boolean dataTransformation);

    void setName(String name);

    void setIcon(String icon);

    void setIconColor(String iconColor);

    void setDescription(String description);

    void setJson(String json);

    void setState(State state);

    State getState();

    Long getOrder();

    void setOrder(Long order);

}
