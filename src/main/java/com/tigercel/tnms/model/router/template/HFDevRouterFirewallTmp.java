package com.tigercel.tnms.model.router.template;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tigercel.tnms.model.router.HFDevRouterGroup;
import com.tigercel.tnms.model.router.support.HFDevRouterFirewall;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by somebody on 2016/8/1.
 */

@Entity
@Data
@Table(name = "hf_router_tmp_firewall")
@JsonIgnoreProperties(ignoreUnknown = true, value={"group", "hibernateLazyInitializer", "handler"})
public class HFDevRouterFirewallTmp extends HFDevRouterFirewall {

    @Column(length = 32)
    private String templateName;

    @Column(length = 128)
    private String templateDescription;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "firewall")
    private Collection<HFDevRouterGroup> group = new ArrayList<>();
}
