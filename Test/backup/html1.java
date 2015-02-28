module org.w3c.html;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Copyright (c) 2000 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.
 * See W3C License http://www.w3.org/Consortium/Legal/ for more details.
 */

// File: http://www.w3.org/TR/2000/WD-DOM-Level-1-20000929/html.idl

//#ifndef _HTML_IDL_
//#define _HTML_IDL_
// 
//#include "dom.idl"
//
//#pragma prefix "dom.w3c.org"
//module html
//{

//  typedef dom::String String;
//  typedef dom::Node Node;
//  typedef dom::Document Document;
//  typedef dom::Element Element;
//  typedef dom::NodeList NodeList;
//
//  public native interface HTMLElement;
//  public native interface form;
//  public native interface HTMLTableCaptionElement;
//  public native interface HTMLTableSectionElement;

  public native interface HTMLCollection {
//  readonly attribute unsigned 
	  public long length{}
	  Node item(final  /*unsigned*/ long index);
	  Node namedItem(final String name);
  }

  public native interface HTMLDocument extends Document {
//	  attribute 
	  public String title{}
//	  readonly attribute 
	  public String referrer{}
//	  readonly attribute 
	  public String domain{}
//	  readonly attribute 
	  public String URL{}
//  attribute 
	  public HTMLElement body{}
//  readonly attribute 
	  public HTMLCollection images{}
//  readonly attribute 
	  public HTMLCollection applets{}
//  readonly attribute 
	  public HTMLCollection links{}
//  readonly attribute 
	  public HTMLCollection forms{}
//  readonly attribute 
	  public HTMLCollection anchors{}
//  attribute 
	  public String cookie{}
	  void open();
	  void close();
	  void write(final  String text);
	  void writeln(final  String text);
	  Element getElementById(final String elementId);
	  NodeList getElementsByName(final String elementName);
  }

  public native interface HTMLElement extends Element, GlobalEventHandlers {
	  //attribute 
	  public String id{}
	  //attribute 
	  public String title{}
	  //attribute 
	  public String lang{}
	  //attribute 
	  public String dir{}
	  //attribute 
	  public String className{}
  }

  public native interface html extends HTMLElement {
	  //attribute 
	  public String version{}
  }

  public native interface head extends HTMLElement {
	  //attribute 
	  public String profile{}
  }

  public native interface link extends HTMLElement {
//	  attribute 
	  boolean disabled{}
//	  attribute 
	  String charset{}
//	  attribute 
	  String href{}
//	  attribute 
	  String hreflang{}
//	  attribute 
	  String media{}
//	  attribute 
	  String rel{}
//	  attribute 
	  String rev{}
//	  attribute 
	  String target{}
//	  attribute 
	  String type{}
  }

  public native interface title extends HTMLElement {
//	  attribute 
	  public String text{}
  }

  public native interface meta extends HTMLElement {
//	  attribute 
	  public String content{}
//	  attribute 
	  public String httpEquiv{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public String scheme{}
  }

  public native interface base extends HTMLElement {
//	  attribute 
	  public String href{}
//	  attribute 
	  public String target{}
  }

  public native interface isindexed extends HTMLElement {
//	  readonly attribute 
	  public form form{}
//	  attribute 
	  String prompt{}
  }

  public native interface stylesheet extends HTMLElement {
//	  attribute 
	  public boolean disabled{}
//	  attribute 
	  public String media{}
//	  attribute 
	  public String type{}
  }

  public native interface body extends HTMLElement {
//	  attribute 
	  public String aLink{}
//	  attribute 
	  public String background{}
//	  attribute 
	  public String bgColor{}
//	  attribute 
	  public String link{}
//	  attribute 
	  public String text{}
//	  attribute 
	  public String vLink{}
  }

  public native interface form extends HTMLElement {
//	  readonly attribute 
	  public HTMLCollection elements{}
//	  readonly attribute 
	  public long  length{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public String acceptCharset{}
//	  attribute 
	  public String action{}
//	  attribute 
	  public String enctype{}
//	  attribute 
	  public String method{}
//	  attribute 
	  public String target{}
	  void  submit();
	  void  reset();
  }

  public native interface select extends HTMLElement {
//	  readonly attribute 
	  public String type{}
//	  attribute 
	  public long selectedIndex{}
//	  attribute 
	  public String value{}
//	  readonly attribute 
	  public long length{}
//	  readonly attribute 
	  public form form{}
//	  readonly attribute 
	  public HTMLCollection options{}
//	  attribute 
	  public boolean disabled{}
//	  attribute 
	  public boolean multiple{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public long size{}
//	  attribute 
	  public long tabIndex{}
	  void add(final HTMLElement element, final HTMLElement before) throws DOMException;
	  void remove(final long index);
	  void blur();
	  void focus();
  }

  public native interface group extends HTMLElement {
//	  attribute 
	  public boolean disabled{}
//	  attribute 
	  public String label{}
  }

  public native interface option extends HTMLElement {
//	  readonly attribute 
	  public form form{}
//	  attribute 
	  public boolean defaultSelected{}
//	  readonly attribute 
	  public String text{}
//	  readonly attribute 
	  public long index{}
//	  attribute 
	  public boolean disabled{}
//	  attribute 
	  public String label{}
//	  attribute 
	  public boolean selected{}
//	  attribute 
	  public String value{}
  }

  public native interface input extends HTMLElement {
//	  attribute 
	  public String defaultValue{}
//	  attribute 
	  public boolean defaultChecked{}
//	  readonly attribute 
	  public form  form{}
//	  attribute 
	  public String accept{}
//	  attribute 
	  public String accessKey{}
//	  attribute 
	  public String align{}
//	  attribute 
	  public String alt{}
//	  attribute 
	  public boolean checked{}
//	  attribute 
	  public boolean disabled{}
//	  attribute 
	  public long maxLength{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public boolean readOnly{}
//	  attribute 
	  public String size{}
//	  attribute 
	  public String src{}
//	  attribute 
	  public long tabIndex{}
//	  readonly attribute 
	  public String type{}
//	  attribute 
	  public String useMap{}
//	  attribute 
	  public String value{}
	  void blur();
	  void focus();
	  void select();
	  void click();
  }

  public native interface textarea extends HTMLElement {
//	  attribute 
	  public String defaultValue{}
//	  readonly attribute 
	  form form{}
//	  attribute 
	  String accessKey{}
//	  attribute 
	  long cols{}
//	  attribute 
	  boolean disabled{}
//	  attribute 
	  String name{}
//	  attribute 
	  boolean readOnly{}
//	  attribute 
	  long rows{}
//	  attribute 
	  long tabIndex{}
//	  readonly attribute 
	  String type{}
//	  attribute 
	  String value{}
	  void blur();
	  void focus();
	  void select();
  }

  public native interface button extends HTMLElement {
//	  readonly attribute 
	  public form  form{}
//	  attribute 
	  public String accessKey{}
//	  attribute 
	  public boolean disabled{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public long  tabIndex{}
//	  readonly attribute 
	  public String type{}
//	  attribute 
	  public String value{}
  }

  public native interface label extends HTMLElement {
//	  readonly attribute 
	  public form form{}
//	  attribute 
	  public String accessKey{}
//	  attribute 
	  public String htmlFor{}
  }

  public native interface fieldset extends HTMLElement {
//	  readonly attribute 
	  public form form{}
  }

  public native interface lengend extends HTMLElement {
//	  readonly attribute 
	  public form form{}
//	  attribute 
	  public String accessKey{}
//	  attribute 
	  public String align{}
  }

  public native interface ul extends HTMLElement {
//	  attribute 
	  public boolean compact{}
//	  attribute 
	  public String type{}
  }

  public native interface ol extends HTMLElement {
//	  attribute 
	  public boolean compact{}
//	  attribute 
	  public long start{}
//	  attribute 
	  public String type{}
  }

  public native interface dl extends HTMLElement {
//	  attribute 
	  public boolean compact{}
  }

  public native interface dictionary extends HTMLElement {
//	  attribute 
	  public boolean compact{}
  }

  public native interface menu extends HTMLElement {
//	  attribute 
	  public boolean compact{}
  }

  public native interface li extends HTMLElement {
//	  attribute 
	  public String type{}
//	  attribute 
	  public long  value{}
  }

  public native interface div extends HTMLElement {
//	  attribute 
	  public String align{}
  }

  public native interface p extends HTMLElement {
//	  attribute 
	  public String align{}
  }

  public native interface heading extends HTMLElement {
//	  attribute 
	  public String align{}
  }

  public native interface quote extends HTMLElement {
//	  attribute 
	  public String cite{}
  }

  public native interface pre extends HTMLElement {
//	  attribute 
	  public long width{}
  }

  public native interface HTMLBRElement extends HTMLElement {
//	  attribute 
	  public String clear{}
  }

  public native interface basefont extends HTMLElement {
//	  attribute 
	  public String color{}
//	  attribute 
	  public String face{}
//	  attribute 
	  public String size{}
  }

  public native interface font extends HTMLElement {
//	  attribute 
	  public String color{}
//	  attribute 
	  public String face{}
//	  attribute 
	  public String size{}
  }

  public native interface hr extends HTMLElement {
//	  attribute 
	  public String align{}
//	  attribute 
	  public boolean noShade{}
//	  attribute 
	  public String size{}
//	  attribute 
	  public String width{}
  }

  public native interface mode extends HTMLElement {
//	  attribute 
	  public String cite{}
//	  attribute 
	  public String dateTime{}
  }

  public native interface a extends HTMLElement {
//	  attribute 
	  public String accessKey{}
//	  attribute 
	  public String charset{}
//	  attribute 
	  public String coords{}
//	  attribute 
	  public String href{}
//	  attribute 
	  public String hreflang{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public String rel{}
//	  attribute 
	  public String rev{}
//	  attribute 
	  public String shape{}
//	  attribute 
	  public long tabIndex{}
//	  attribute 
	  public String target{}
//	  attribute 
	  public String type{}
	  void  blur();
	  void  focus();
  }

  public native interface img extends HTMLElement {
//	  attribute 
	  public String lowSrc{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public String align{}
//	  attribute 
	  public String alt{}
//	  attribute 
	  public String border{}
//	  attribute 
	  public String height{}
//	  attribute 
	  public String hspace{}
//	  attribute 
	  public boolean isMap{}
//	  attribute 
	  public String longDesc{}
//	  attribute 
	  public String src{}
//	  attribute 
	  public String useMap{}
//	  attribute 
	  public String vspace{}
//	  attribute 
	  public String width{}
  }

  public native interface object extends HTMLElement {
//	  readonly attribute 
	  public form form{}
//	  attribute 
	  public String code{}
//	  attribute 
	  public String align{}
//	  attribute 
	  public String archive{}
//	  attribute 
	  public String border{}
//	  attribute 
	  public String codeBase{}
//	  attribute 
	  public String codeType{}
//	  attribute 
	  public String data{}
//	  attribute 
	  public boolean declare{}
//	  attribute 
	  public String height{}
//	  attribute 
	  public String hspace{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public String standby{}
//	  attribute 
	  public long tabIndex{}
//	  attribute 
	  public String type{}
//	  attribute 
	  public String useMap{}
//	  attribute 
	  public String vspace{}
//	  attribute 
	  public String width{}
  }

  public native interface param extends HTMLElement {
//	  attribute 
	  public String name{}
//	  attribute 
	  public String type{}
//	  attribute 
	  public String value{}
//	  attribute 
	  public String valueType{}
  }

  public native interface applet extends HTMLElement {
//	  attribute 
	  public String align{}
//	  attribute 
	  public String alt{}
//	  attribute 
	  public String archive{}
//	  attribute 
	  public String code{}
//	  attribute 
	  public String codeBase{}
//	  attribute 
	  public String height{}
//	  attribute 
	  public String hspace{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public String object{}
//	  attribute 
	  public String vspace{}
//	  attribute 
	  public String width{}
  }

  public native interface map extends HTMLElement {
//	  readonly attribute 
	  public HTMLCollection areas{}
//	  attribute 
	  public String name{}
  }

  public native interface area extends HTMLElement {
//	  attribute 
	  public String accessKey{}
//	  attribute 
	  public String alt{}
//	  attribute 
	  public String coords{}
//	  attribute 
	  public String href{}
//	  attribute 
	  public boolean noHref{}
//	  attribute 
	  public String shape{}
//	  attribute 
	  public long tabIndex{}
//	  attribute 
	  public String target{}
  }

  public native interface script extends HTMLElement {
//	  attribute 
	  public String text{}
//	  attribute 
	  public String htmlFor{}
//	  attribute 
	  public String event{} 
//	  attribute 
	  public String charset{}
//	  attribute 
	  public boolean defer{}
//	  attribute 
	  public String src{}
//	  attribute 
	  public String type{}
  }

  public native interface table extends HTMLElement {
//	  attribute 
	  public caption  caption{}
//	  attribute 
	  public HTMLTableSectionElement  tHead{}
//	  attribute 
	  public HTMLTableSectionElement  tFoot{}
//	  readonly attribute 
	  public HTMLCollection rows{}
//	  readonly attribute 
	  public HTMLCollection tBodies{}
//	  attribute 
	  public String align{}
//	  attribute 
	  public String bgColor{}
//	  attribute 
	  public String border{}
//	  attribute 
	  public String cellPadding{}
//	  attribute 
	  public String cellSpacing{}
//	  attribute 
	  public String frame{}
//	  attribute 
	  public String rules{}
//	  attribute 
	  public String summary{}
//	  attribute 
	  public String width{}
	  HTMLElement createTHead();
	  void  deleteTHead();
	  HTMLElement createTFoot();
	  void  deleteTFoot();
	  HTMLElement createCaption();
	  void  deleteCaption();
	  HTMLElement insertRow(final long index) throws DOMException;
	  void  deleteRow(final long index) throws DOMException;
  }

  public native interface caption extends HTMLElement {
//	  attribute 
	  public String align{}
  }

  public native interface tableCol extends HTMLElement {
//	  attribute 
	  public String align{}
//	  attribute 
	  public String ch{}
//	  attribute 
	  public String chOff{}
//	  attribute 
	  public long  span{}
//	  attribute 
	  public String vAlign{}
//	  attribute 
	  public String width{}
  }

  public native interface HTMLTableSectionElement extends HTMLElement {
//	  attribute 
	  public String align{}
//	  attribute 
	  public String ch{}
//	  attribute 
	  public String chOff{}
//	  attribute 
	  public String vAlign{}
//	  readonly attribute 
	  public HTMLCollection rows{}
	  HTMLElement insertRow(final  long index) throws DOMException;
	  void  deleteRow(final  long index) throws DOMException;
  }

  public native interface tr extends HTMLElement {
//	  readonly attribute 
	  public long rowIndex{}
//	  readonly attribute 
	  public long sectionRowIndex{}
//	  readonly attribute 
	  public HTMLCollection cells{}
//	  attribute 
	  public String align{}
//	  attribute 
	  public String bgColor{}
//	  attribute 
	  public String ch{}
//	  attribute 
	  public String chOff{}
//	  attribute 
	  public String vAlign{}
	  HTMLElement insertCell(final long index) throws DOMException;
	  void deleteCell(final  long index) throws DOMException;
  }

  public native interface td extends HTMLElement {
//	  readonly attribute 
	  public long  cellIndex{}
//	  attribute 
	  public String abbr{}
//	  attribute 
	  public String align{}
//	  attribute 
	  public String axis{}
//	  attribute 
	  public String bgColor{}
//	  attribute 
	  public String ch{}
//	  attribute 
	  public String chOff{}
//	  attribute 
	  public long  colSpan{}
//	  attribute 
	  public String headers{}
//	  attribute 
	  public String height{}
//	  attribute 
	  public boolean noWrap{}
//	  attribute 
	  public long  rowSpan{}
//	  attribute 
	  public String scope{}
//	  attribute 
	  public String vAlign{}
//	  attribute 
	  public String width{}
  }

  public native interface frameset extends HTMLElement {
//	  attribute 
	  public String cols{}
//	  attribute 
	  public String rows{}
  }

  public native interface frame extends HTMLElement {
//	  attribute 
	  public String frameBorder{}
//	  attribute 
	  public String longDesc{}
//	  attribute 
	  public String marginHeight{}
//	  attribute 
	  public String marginWidth{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public boolean noResize{}
//	  attribute 
	  public String scrolling{}
//	  attribute 
	  public String src{}
  }

  public native interface iframe extends HTMLElement {
//	  attribute 
	  public String align{}
//	  attribute 
	  public String frameBorder{}
//	  attribute 
	  public String height{}
//	  attribute 
	  public String longDesc{}
//	  attribute 
	  public String marginHeight{}
//	  attribute 
	  public String marginWidth{}
//	  attribute 
	  public String name{}
//	  attribute 
	  public String scrolling{}
//	  attribute 
	  public String src{}
//	  attribute 
	  public String width{}
  }

