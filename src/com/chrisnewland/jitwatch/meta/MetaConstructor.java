package com.chrisnewland.jitwatch.meta;

import java.lang.reflect.Constructor;

public class MetaConstructor extends AbstractMetaMember implements Comparable<MetaConstructor>
{
	private Constructor<?> constructor;

	public MetaConstructor(Constructor<?> constructor, MetaClass methodClass)
	{
		this.constructor = constructor;
		this.methodClass = methodClass;
	}

	@Override
	public String toString()
	{
		String methodSigWithoutThrows = constructor.toString();

		int closingParentheses = methodSigWithoutThrows.indexOf(')');

		if (closingParentheses != methodSigWithoutThrows.length() - 1)
		{
			methodSigWithoutThrows = methodSigWithoutThrows.substring(0, closingParentheses + 1);
		}

		return methodSigWithoutThrows;
	}

	@Override
	public String getSignatureRegEx()
	{
		String unqualifiedSig = makeUnqualified(constructor.toString());

		return unqualifiedSig;
	}

	@Override
	public String getSignatureForBytecode()
	{
		return constructor.toString();
	}

	@Override
	public int compareTo(MetaConstructor o)
	{
		if (o == null)
		{
			return -1;
		}
		else
		{
			return toString().compareTo(o.toString());
		}
	}
}