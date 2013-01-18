
package org.openetcs.es3f.importer.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>char_value</i></h3>
  * <br>
  * This code is generated automatically. It is not meant
  * to be maintained or even read. As it is generated, 
  * it does not follow any coding standard. Please refrain
  * from performing any change directly on this generated 
  * code, as it might be overwritten anytime.
  * <br>
  * This documentation is provided for information purposes
  * only, in order to make the generated API somehow more
  * understandable. It is meant to be a maintenance guide,
  * as this code is not meant to be maintained at all.
  */
public class char_value
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getEncoding().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aEncoding;

public   String  getEncoding() { return aEncoding;}

public  void setEncoding( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getEncoding())));
} else {
  __setDirty ( __getDirty() || (getEncoding() != null));
} // If
  aEncoding = v;
}

public char_value()
{
char_value obj = this;
aEncoding=(null);
}

public void copyTo(char_value other)
{
other.aEncoding = aEncoding;
}

  boolean __dirty = false;

public void __setDirty(boolean val)
{
  __dirty = val;
}

public boolean __getDirty()
{
  return __dirty;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void parseBody(xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
int indicator=0;
char quoteChar;
 String  tempStr;

ctxt.skipWhiteSpace();
ctxt.skipWhiteSpace();
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public  void parse(xmlBContext ctxt,  String  endingTag)
throws xmlBException, xmlBRecoveryException
{
int indicator = 0;
char quoteChar;
 String  tempStr = null;
boolean fl1457;
boolean fl1458;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1457 = false ; 
fl1458 = true ; 
while (fl1458) { // BeginLoop 
if (ctxt.lookAheadString("encoding=")){
indicator = 1457;
} else {
indicator = 1459;
} // If
switch (indicator) {
case 1457: {
// Handling attribute encoding
// Also handles alien attributes with prefix encoding
if (fl1457){
ctxt.fail ("Duplicate attribute: encoding");
} // If
fl1457 = true ; 
quoteChar = ctxt.acceptQuote();
this.setEncoding((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1459: {
// Taking ignorable attributes into account
if (ctxt.isAlNum()){
ctxt.skipTill ('=');
ctxt.advance();
ctxt.skipWhiteSpace();
quoteChar = ctxt.acceptQuote();
ctxt.skipTill (quoteChar);
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
} else {
if (!fl1457){
ctxt.fail ("Mandatory attribute missing: encoding in char-value");
} // If
fl1458 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</char-value>");
// If formula empty
} // If
}

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
 public  void unParse(PrintWriter pw,
                    boolean typeId,
                     String  headingTag,
                     String  endingTag)
{
int i;

pw.print("<char-value");
if (typeId){
pw.print(" xsi:type=\"char-value\"");
} // If
pw.println();
pw.print(" encoding=\"");
acceptor.unParsePcData(pw, this.getEncoding());
pw.print('"');
pw.println();
pw.print("/>");
pw.println();
unParseBody(pw);
}

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void unParseBody(PrintWriter pw)
{
int i;

}
public  void dispatch(xmlBBaseVisitor v)
{
  ((Visitor)v).visit(this);
}

public  void dispatch(xmlBBaseVisitor v, boolean visitSubNodes)
{
  ((Visitor)v).visit(this, visitSubNodes);
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void subElements(ArrayList l)
{
}

}
