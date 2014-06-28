package com.github.mperry.fg.typeclass

import fj.F
import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 28/06/2014.
 */
@TypeChecked
class IdentityMonadFromTrait<A> implements MonadTrait<Identity<A>> {

	static <A> IdentityMonadFromClass<A> monad() {
		new IdentityMonadFromClass<A>()
	}

	def <A> Identity<A> unit(A a) {
		Identity.unit(a)
	}

	def <A, B> Identity<B> flatMap(Identity<A> id, F<A, Identity<B>> f) {
		id.flatMap(f)
	}

}
