package com.github.mperry.fg.typeclass.concrete

import com.github.mperry.fg.typeclass.concrete.Identity
import com.github.mperry.fg.typeclass.concrete.IdentityMonad
import org.junit.Test

import static org.junit.Assert.assertTrue

//import static com.github.mperry.fg.typeclass.concrete.IdentityMonad.getMonad
/**
 * Created by MarkPerry on 28/06/2014.
 */
//@TypeChecked
class IdentityTest {


	@Test
	void test2() {
		def id = Identity.unit(0)
		assertTrue(id == Identity.unit(0))
		def id2 = id.flatMap({ Integer i -> Identity.unit(i + 2)})
		assertTrue(id2 == Identity.unit(2))
		def id3 = Identity.unit("")
		assertTrue(id3 == Identity.unit(""))
		def id4 = id3.map { String s -> 3 }
		assertTrue(id4 == Identity.unit(3))

//		println id2
	}


	@Test
	void test3() {
		def m = IdentityMonad.<Integer>monad()

//		def id = m.unit(0)
//		assertTrue(unit(0) == m.unit(0))
//		assertTrue(m.flatMap(id, { Integer i -> unit(i + 2)}) == unit(2))


	}

}
