package definition;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.*;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.print(" 执行原始的基本功能 ");
    }
}
