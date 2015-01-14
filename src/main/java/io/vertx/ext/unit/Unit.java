package io.vertx.ext.unit;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Handler;
import io.vertx.ext.unit.impl.ModuleImpl;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface Unit {

  static Module module() {
    return new ModuleImpl();
  }

  static Module module(String desc) {
    return new ModuleImpl(desc);
  }

  static Module asyncTest(String desc, Handler<Test> handler) {
    return module(null).asyncTest(desc, handler);
  }

  static Module test(String desc, Handler<Test> handler) {
    return module(null).test(desc, handler);
  }
}
