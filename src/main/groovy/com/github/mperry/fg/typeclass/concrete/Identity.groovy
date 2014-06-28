package com.github.mperry.fg.typeclass.concrete

import fj.F
import groovy.transform.Canonical
import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 27/06/2014.
 */
@Canonical
@TypeChecked
class Identity<A> {

	A item

	static <B> Identity<B> unit(B b) {
		new Identity<B>(b)
	}

	def <B> Identity<B> map(F<A, B> f) {
		unit(f.f(item))
	}

	def <B> Identity<B> flatMap(F<A, Identity<B>> f) {
		f.f(item)
	}

}
