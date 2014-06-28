package com.github.mperry.fg.typeclass.concrete

import fj.F

import com.github.mperry.fg.typeclass.*
import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 28/06/2014.
 */
//@TypeChecked
class IdentityMonad<A> implements Monad<Identity<A>> {

	static <A> IdentityMonad<A> monad() {
		new IdentityMonad<A>()
	}

	def <A> Identity<A> unit(A a) {
		Identity.unit(a)
	}

	def <A, B> Identity<B> flatMap(Identity<A> id, F<A, Identity<B>> f) {
		id.flatMap(f)
	}

}
