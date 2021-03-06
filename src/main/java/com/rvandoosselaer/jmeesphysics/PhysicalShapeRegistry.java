/**
 * Copyright (c) 2020, rvandoosselaer
 * All rights reserved.
 * <p>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * <p>
 * 1. Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * <p>
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * <p>
 * 3. Neither the name of the copyright holder nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.rvandoosselaer.jmeesphysics;

import com.jme3.bullet.collision.shapes.CollisionShape;
import com.rvandoosselaer.jmeesphysics.es.PhysicalShape;

/**
 * A register of collision shapes that can be retrieved by a key.
 */
public interface PhysicalShapeRegistry {

    /**
     * Register the collision shape with the physical component.
     *
     * @param shapeId
     * @param collisionShape
     * @return the collision shape
     */
    CollisionShape register(String shapeId, CollisionShape collisionShape);

    /**
     * Register the collision shape with the physical shape component
     *
     * @param physicalShape  the physical shape component holding the key
     * @param collisionShape the physical collision shape
     * @return the collision shape linked to the physical shape
     */
    CollisionShape register(PhysicalShape physicalShape, CollisionShape collisionShape);

    /**
     * Returns the collision shape linked to the physical shape component
     *
     * @param physicalShape the physical shape component holding the key
     * @return the collision shape linked to the physical shape
     */
    CollisionShape get(PhysicalShape physicalShape);

}
