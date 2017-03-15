
/**
 * SellServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package org.example.www._2ndhandbike.sellservice;

/**
 * SellServiceMessageReceiverInOut message receiver
 */

public class SellServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			SellServiceSkeleton skel = (SellServiceSkeleton) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils
					.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {

				if ("addCart".equals(methodName)) {

					org.example.www._2ndhandbike.sellservice.AddCartResponse addCartResponse13 = null;
					org.example.www._2ndhandbike.sellservice.AddCart wrappedParam = (org.example.www._2ndhandbike.sellservice.AddCart) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							org.example.www._2ndhandbike.sellservice.AddCart.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					addCartResponse13 =

							skel.addCart(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), addCartResponse13, false,
							new javax.xml.namespace.QName("http://www.example.org/2ndHandBike/SellService/",
									"addCart"));
				} else

				if ("orderCompletion".equals(methodName)) {

					org.example.www._2ndhandbike.sellservice.OrderCompletionResponse orderCompletionResponse15 = null;
					org.example.www._2ndhandbike.sellservice.OrderCompletion wrappedParam = (org.example.www._2ndhandbike.sellservice.OrderCompletion) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							org.example.www._2ndhandbike.sellservice.OrderCompletion.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					orderCompletionResponse15 =

							skel.orderCompletion(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), orderCompletionResponse15, false,
							new javax.xml.namespace.QName("http://www.example.org/2ndHandBike/SellService/",
									"orderCompletion"));
				} else

				if ("checkOut".equals(methodName)) {

					org.example.www._2ndhandbike.sellservice.CheckOutResponse checkOutResponse17 = null;
					org.example.www._2ndhandbike.sellservice.CheckOut wrappedParam = (org.example.www._2ndhandbike.sellservice.CheckOut) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							org.example.www._2ndhandbike.sellservice.CheckOut.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					checkOutResponse17 =

							skel.checkOut(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), checkOutResponse17, false,
							new javax.xml.namespace.QName("http://www.example.org/2ndHandBike/SellService/",
									"checkOut"));

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM(org.example.www._2ndhandbike.sellservice.AddCart param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.example.www._2ndhandbike.sellservice.AddCart.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.example.www._2ndhandbike.sellservice.AddCartResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.example.www._2ndhandbike.sellservice.AddCartResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.example.www._2ndhandbike.sellservice.OrderCompletion param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.example.www._2ndhandbike.sellservice.OrderCompletion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.example.www._2ndhandbike.sellservice.OrderCompletionResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.example.www._2ndhandbike.sellservice.OrderCompletionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.example.www._2ndhandbike.sellservice.CheckOut param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.example.www._2ndhandbike.sellservice.CheckOut.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.example.www._2ndhandbike.sellservice.CheckOutResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.example.www._2ndhandbike.sellservice.CheckOutResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			org.example.www._2ndhandbike.sellservice.AddCartResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.example.www._2ndhandbike.sellservice.AddCartResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.example.www._2ndhandbike.sellservice.AddCartResponse wrapaddCart() {
		org.example.www._2ndhandbike.sellservice.AddCartResponse wrappedElement = new org.example.www._2ndhandbike.sellservice.AddCartResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			org.example.www._2ndhandbike.sellservice.OrderCompletionResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param
					.getOMElement(org.example.www._2ndhandbike.sellservice.OrderCompletionResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.example.www._2ndhandbike.sellservice.OrderCompletionResponse wraporderCompletion() {
		org.example.www._2ndhandbike.sellservice.OrderCompletionResponse wrappedElement = new org.example.www._2ndhandbike.sellservice.OrderCompletionResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			org.example.www._2ndhandbike.sellservice.CheckOutResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.example.www._2ndhandbike.sellservice.CheckOutResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.example.www._2ndhandbike.sellservice.CheckOutResponse wrapcheckOut() {
		org.example.www._2ndhandbike.sellservice.CheckOutResponse wrappedElement = new org.example.www._2ndhandbike.sellservice.CheckOutResponse();
		return wrappedElement;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

		try {

			if (org.example.www._2ndhandbike.sellservice.AddCart.class.equals(type)) {

				return org.example.www._2ndhandbike.sellservice.AddCart.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.example.www._2ndhandbike.sellservice.AddCartResponse.class.equals(type)) {

				return org.example.www._2ndhandbike.sellservice.AddCartResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.example.www._2ndhandbike.sellservice.CheckOut.class.equals(type)) {

				return org.example.www._2ndhandbike.sellservice.CheckOut.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.example.www._2ndhandbike.sellservice.CheckOutResponse.class.equals(type)) {

				return org.example.www._2ndhandbike.sellservice.CheckOutResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.example.www._2ndhandbike.sellservice.OrderCompletion.class.equals(type)) {

				return org.example.www._2ndhandbike.sellservice.OrderCompletion.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.example.www._2ndhandbike.sellservice.OrderCompletionResponse.class.equals(type)) {

				return org.example.www._2ndhandbike.sellservice.OrderCompletionResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();
		if (cause != null) {
			f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
		} else {
			f = new org.apache.axis2.AxisFault(e.getMessage());
		}

		return f;
	}

}// end of class
