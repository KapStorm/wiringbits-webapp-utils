package net.wiringbits.webapp.utils.ui.web.facades.reactadmin

import io.github.nafg.simplefacade.Implicits._
import io.github.nafg.simplefacade.{FacadeModule, PropTypes}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js

trait FieldProps extends PropTypes {
  val source = of[String]
  val disabled = of[Boolean]
}

object EmailField extends FacadeModule.Simple {
  override def raw = ReactAdmin.EmailField
  class Props extends FieldProps
  override def mkProps = new Props
}

object ImageField extends FacadeModule.Simple {
  override def raw = ReactAdmin.ImageField
  class Props extends FieldProps {
    val sx = of[js.Object]
  }
  override def mkProps = new Props
}

trait ReferenceBase extends FacadeModule.NodeChildren.Simple {
  class Props extends PropTypes.WithChildren[VdomNode] {
    val children = of[VdomNode]
    val source = of[String]
    val reference = of[String]
  }
  override def mkProps = new Props
}

object ReferenceField extends ReferenceBase {
  override def raw = ReactAdmin.ReferenceField
}

object ReferenceInput extends ReferenceBase {
  override def raw = ReactAdmin.ReferenceInput
}

object SelectInput extends FacadeModule.Simple {
  override def raw = ReactAdmin.SelectInput
  class Props extends PropTypes {
    val optionText = of[String]
    val disabled = of[Boolean]
  }
  override def mkProps = new Props
}

object TextField extends FacadeModule.Simple {
  override def raw = ReactAdmin.TextField
  class Props extends FieldProps
  override def mkProps = new Props
}

object DateField extends FacadeModule.Simple {
  override def raw = ReactAdmin.DateField
  class Props extends FieldProps {
    val showTime = of[Boolean]
  }
  override def mkProps = new Props
}

object DateTimeInput extends FacadeModule.Simple {
  override def raw = ReactAdmin.DateTimeInput
  class Props extends FieldProps
  override def mkProps = new Props
}

object TextInput extends FacadeModule.Simple {
  override def raw = ReactAdmin.TextInput
  class Props extends FieldProps {
    val multiline = of[Boolean]
  }
  override def mkProps = new Props
}

object UrlField extends FacadeModule.Simple {
  override def raw = ReactAdmin.UrlField
  class Props extends FieldProps
  override def mkProps = new Props
}

object DateInput extends FacadeModule.Simple {
  override def raw = ReactAdmin.DateInput
  class Props extends FieldProps
  override def mkProps = new Props
}

object NumberInput extends FacadeModule.Simple {
  override def raw = ReactAdmin.NumberInput
  class Props extends FieldProps {
    val max = of[Double]
    val min = of[Double]
    val step = of[Double]
  }
  override def mkProps: Props = new Props
}

object NumberField extends FacadeModule.Simple {
  override def raw = ReactAdmin.NumberField
  class Props extends FieldProps
  override def mkProps = new Props
}
