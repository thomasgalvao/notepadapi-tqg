package br.com.thomasgalvao.notepadapi.repository

import br.com.thomasgalvao.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRepository : MongoRepository<Nota, String>{
    @Query("{}")
    fun all(): Stream<Nota>

    //findBy***** conteudo a seguir sao as buscas no banco, neste caso vai fazer uma busca por titulo
    fun findByTitulo(titulo: String) : Nota
}