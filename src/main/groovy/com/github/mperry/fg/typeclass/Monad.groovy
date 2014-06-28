package com.github.mperry.fg.typeclass

import fj.F
import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 26/06/2014.
 */
@TypeChecked
trait Monad<M> {

	/**
	 * Sequentially compose two actions, passing any value produced by the first as
	 * an argument to the second.
	 * (>>=) :: forall a b. m a -> (a -> m b) -> m b
	 */
	abstract <A, B> M<B> flatMap(M<A> ma, F<A, M<B>> f)

	/**
	 * Inject a value into the monadic type.
	 * return :: a -> m a
	 */
	abstract <B> M<B> unit(B b)


}
