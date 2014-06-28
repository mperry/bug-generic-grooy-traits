package com.github.mperry.fg.typeclass

import fj.F
import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 28/06/2014.
 */
@TypeChecked
abstract class MonadClass<M> {

	abstract <A, B> M<B> flatMap(M<A> ma, F<A, M<B>> f)
	abstract <B> M<B> unit(B b)

}
