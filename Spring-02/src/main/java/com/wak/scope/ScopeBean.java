package com.wak.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wak
 */
@Component
@Scope("prototype")
public class ScopeBean {
}
