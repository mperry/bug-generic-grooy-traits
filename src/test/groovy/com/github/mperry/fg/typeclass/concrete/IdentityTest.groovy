package com.github.mperry.fg.typeclass.concrete

import com.github.mperry.fg.typeclass.IdentityMonadFromClass
import com.github.mperry.fg.typeclass.IdentityMonadFromTrait
import groovy.transform.TypeChecked
import org.junit.Test

import static com.github.mperry.fg.typeclass.Identity.unit
import static org.junit.Assert.assertTrue

//import static com.github.mperry.fg.typeclass.concrete.IdentityMonad.getMonad
/**
 * Created by MarkPerry on 28/06/2014.
 */
@TypeChecked
class IdentityTest {

	@Test
	void testIdentity() {
		assertTrue(unit(0) == unit(0))
		assertTrue(unit(0).flatMap({ Integer i -> unit(i + 2)}) == unit(2))
		assertTrue(unit("") == unit(""))
		assertTrue(unit("").map { String s -> 3 } == unit(3))
	}

	@Test
	void testMonadClass() {
		def m = IdentityMonadFromClass.<Integer>monad()
		assertTrue(m.unit(0) == unit(0))
		assertTrue(m.unit(2) == m.flatMap(m.unit(0)) { unit(2) })
	}

	@Test
	void testMonadTrait() {
		def m1 = IdentityMonadFromTrait.<Integer>monad()
//		def m2 = new IdentityMonadFromTrait<Integer>()
//		def m3 = new IdentityMonadFromTrait()
		def m = m1
		assertTrue(m.unit(0) == unit(0))
		assertTrue(m.unit(2) == m.flatMap(m.unit(0)) { unit(2) })
	}

}
